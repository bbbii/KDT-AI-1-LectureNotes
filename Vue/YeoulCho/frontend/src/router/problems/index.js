import Vue from 'vue'
import VueRouter from 'vue-router'
import Problem1Page from "@/views/homework/problem1/Problem1Page.vue"
import Problem2Page from "@/views/homework/problem2/Problem2Page.vue"
import Problem22Page from "@/views/homework/problem2/problem2re/Problem2.vue"
import BasicProblemPage from "@/views/homework/basicProblem/BasicProblem.vue"
import Problem3Page from "@/views/homework/problem3/Problem3Page.vue"

import StudyPage from "@/views/homework/study/Study.vue"
import Problem4Page from "@/views/homework/problem4/Problem4Page.vue"
import Problem5Page from "@/views/homework/problem5/Problem5Page.vue"
import Problem5Page2 from "@/views/homework/problem5/Problem5Page2.vue"
import Problem6Page from '@/views/homework/problem6/Problem6Page.vue'
Vue.use(VueRouter)

const problemRoutes = [
    {
        path: '/problem1-page',
        name: 'Problem1Page',
        component: Problem1Page
      },
    {
        path: '/problem2-page',
        name: 'Problem2Page',
        component: Problem2Page
      },
      {
        path: '/problem2-2page',
        name: 'Problem22Page',
        component: Problem22Page
      },
      {
        path: '/basic-problem',
        name: 'BasicProblemPage',
        component: BasicProblemPage
      },
      {
        path: '/problem3-page',
        name: 'Problem3Page',
        component: Problem3Page
      },
      {
        path: '/study-page',
        name: 'StudyPage',
        component: StudyPage
      },
      {
        path: '/problem4-page',
        name: 'Problem4Page',
        component: Problem4Page
      },
      {
        path: '/problem5-page',
        name: 'Problem5Page',
        component: Problem5Page
      },
      {
        path: '/problem5-page2',
        name: 'Problem5Page2',
        component: Problem5Page2
      },
      {
        path: '/problem6-page',
        name: 'Problem6Page',
        component: Problem6Page
      },


]



export default problemRoutes