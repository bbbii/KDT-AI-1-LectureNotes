import { UseQueryResult, useQuery } from 'react-query'
import axiosInst from '../utility/axiosInstance'
import { Board } from '../entity/Board'
import useBoardStore from '../store/BoardStore'

export const fetchBoardList = async (): Promise<Board[]> => {
  const response = await axiosInst.springAxiosInst.get<Board[]>('/jpa-board/list')
  return response.data
}

export const useBoardListQuery = (): UseQueryResult<Board[], unknown> => {
  const setBoards = useBoardStore((state) => state.setBoards)

  const queryResult: UseQueryResult<Board[], unknown> = useQuery('boardList', fetchBoardList, {
    onSuccess: (data) => {
        setBoards(data)
    }
  })

  return queryResult
}

export const registerBoard = async (
  data: { title: string; writer: string; content: string }
): Promise<Board> => {
  const response = await axiosInst.springAxiosInst.post<Board>('/jpa-board/register', data)
  return response.data
}

export const fetchBoard = async (boardId: string): Promise<Board | null> => {
  const response = await axiosInst.springAxiosInst.get<Board>(`/jpa-board/${boardId}`)
  return response.data
}

export const useBoardQuery = (boardId: string): UseQueryResult<Board | null, unknown> => {
  return useQuery(['board', boardId], () => fetchBoard(boardId))
}