package com.example.demo.lectureClass.vue.controller.vue.problem.controller.form;

import com.example.demo.lectureClass.vue.controller.vue.player.Player;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@RequiredArgsConstructor
public class MultiPlayerWinnerResponseForm {
    final private String winnerName;
    final private List<Player> playerList;
}

