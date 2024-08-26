package com.togedog.comment.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

public class CommentDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Post {
        @NotBlank
        private String comment;

        private long boardId;
    }

    @NoArgsConstructor
    @Getter
    @Setter
    public static class Patch{

        @NotBlank
        private String comment;

        private long commentId;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @Builder
    public static class Response {
        private long commentId;
        private String comment;
    }
}