package com.togedog.comment.mapper;

import com.togedog.board.entity.Board;
import com.togedog.comment.dto.CommentDto;
import com.togedog.comment.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    default Comment commentPostToComment(CommentDto.Post requestBody) {
        Board board = new Board();
        board.setBoardId(requestBody.getBoardId());
        Comment comment = new Comment();
        comment.setBoard(board);
        comment.setComment(requestBody.getComment());
        return comment;
    }

    Comment commentPatchToComment(CommentDto.Patch requestBody);
    CommentDto.Response commentToCommentResponse(Comment comment);
}
