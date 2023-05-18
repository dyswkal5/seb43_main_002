package com.branch.sikgu.exception;

public enum ExceptionCode {
    DUPLICATE_EMAIL("중복된 이메일입니다."),
    DUPLICATE_NICKNAME("중복된 닉네임입니다."),
    INVALID_PASSWORD("잘못된 비밀번호입니다."),
    INVALID_TOKEN("유효한 토큰이 아닙니다."),

    // Post
    BOARD_NOT_FOUND("해당 포스트를 찾을 수 없습니다."),
    INACTIVED_BOARD("비활성화 된 게시물입니다."),

    // Comment
    COMMENT_NOT_FOUND("해당 댓글을 찾을 수 없습니다."),
    DELETED_COMMENT("삭제된 댓글입니다."),

    //Member & Auth Exception
    MEMBER_NOT_FOUND("Member not found"),
    MEMBER_EXISTS("Member already exists"),
    MEMBER_MISMATCHED("Not Matched Member"),
    MEMBER_FORBIDDEN("Member Forbidden"),
    MEMBER_UNAUTHORIZED("UNAUTHORIZED"),
    INVALID_REQUEST("잘못된 요청입니다.");

    private final String message;

    ExceptionCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}