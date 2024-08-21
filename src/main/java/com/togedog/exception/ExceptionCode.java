package com.togedog.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ExceptionCode {
    //match 관련
    MATCH_NOT_FOUND(404,"MATCH_NOT_FOUND"),
    MATCH_ALREADY_EXISTS(409,"MATCH_ALREADY_EXISTS"),

    //board 관련
    BOARD_NOT_FOUND(404,"Board Not Found"),
    BOARD_EXISTS(409,"Board exists"),

    //member 관련
    MEMBER_NOT_FOUND(404,"Member Not Found"),
    MEMBER_EXISTS(409,"Member exists"),
    PHONE_EXISTS(409, "Phone exists"),
    NICKNAME_EXISTS(409, "NickName exists"),

    //friend 관련
    REQUEST_NOT_FOUND(404, "Request Not Found"),

    //Pet 관련
    PET_NOT_FOUND(404, "Pet Not Found"),
    PET_EXISTS(409,"Pet exists"),

    //친구 요청 관련
    UNAUTHORIZED_ACCESS(404, "친구요청을 없습니다.");

    @Getter
    private int statusCode;

    @Getter
    private String statusDescription;


}