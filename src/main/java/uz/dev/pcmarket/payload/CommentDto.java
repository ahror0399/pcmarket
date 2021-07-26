package uz.dev.pcmarket.payload;

import lombok.Data;

@Data
public class CommentDto {

    private String name;

    private String description;

    private Integer attachmentId;


}
