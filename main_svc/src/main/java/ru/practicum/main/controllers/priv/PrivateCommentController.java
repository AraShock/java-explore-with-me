package ru.practicum.main.controllers.priv;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.main.constants.Pattern;
import ru.practicum.main.dto.comment.CommentDto;
import ru.practicum.main.dto.comment.NewCommentDto;
import ru.practicum.main.services.CommentService;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;
import java.util.List;

import static ru.practicum.main.constants.Pattern.COMMENT_ID;
import static ru.practicum.main.constants.Pattern.ENDPOINT;

@RestController
@RequestMapping("/users/{userId}/comments")
@Validated
@RequiredArgsConstructor
public class PrivateCommentController {
    private final CommentService commentService;

    @PostMapping("/{eventId}")
    @ResponseStatus(HttpStatus.CREATED)
    public CommentDto createComment(@RequestBody @Valid NewCommentDto newCommentDto,
                                    @PathVariable(value = "userId") Long userId,
                                    @PathVariable(value = "eventId") Long eventId) {
        return commentService.createComment(newCommentDto, userId, eventId);
    }

    @PatchMapping(ENDPOINT)
    public CommentDto updateComment(@RequestBody @Valid NewCommentDto newCommentDto,
                                    @PathVariable(value = "userId") Long userId,
                                    @PathVariable(value = COMMENT_ID) Long commentId) {
        return commentService.updateCommentByUser(newCommentDto, userId, commentId);
    }

    @GetMapping(ENDPOINT)
    public CommentDto getCommentById(@PathVariable(value = "userId") Long userId,
                                     @PathVariable(value = COMMENT_ID) Long commentId) {
        return commentService.getCommentsByIdByUser(userId, commentId);
    }

    @GetMapping
    public List<CommentDto> getUserCommentsByCreateTime(@PathVariable(value = "userId") Long userId,
                                                        @PositiveOrZero
                                                        @RequestParam(value = "from", defaultValue = "0") Integer from,
                                                        @Positive
                                                        @RequestParam(value = "size", defaultValue = "10") Integer size,
                                                        @RequestParam(value = "createStart", required = false)
                                                        @DateTimeFormat(pattern = Pattern.DATE)
                                                        LocalDateTime createStart,
                                                        @RequestParam(value = "createEnd", required = false)
                                                        @DateTimeFormat(pattern = Pattern.DATE)
                                                        LocalDateTime createEnd) {
        return commentService.getUserCommentsByCreateTime(userId, createStart, createEnd, from, size);
    }

    @DeleteMapping(ENDPOINT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCommentByUser(@PathVariable(value = "userId") Long userId,
                                    @PathVariable(value = COMMENT_ID) Long commentId) {
        commentService.deleteCommentByUser(userId, commentId);
    }
}