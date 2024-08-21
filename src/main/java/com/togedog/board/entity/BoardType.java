package com.togedog.board.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum BoardType {

    @AllArgsConstructor
    REPORT("신고 게시판"),
    INQUIRY("문의 게시판"),
    REVIEW("후기 게시판"),
        BOAST("자랑 게시판"),
        NOTICE("공지 게시판");

        @Getter
        private String boardDescription;
}
