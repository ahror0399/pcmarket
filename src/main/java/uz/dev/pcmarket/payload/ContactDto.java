package uz.dev.pcmarket.payload;

import lombok.Data;

@Data
public class ContactDto {

    private String name;

    private String profession;

    private Integer attachmentId;
}
