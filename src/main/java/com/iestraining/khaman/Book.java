package com.iestraining.khaman;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data // == @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor
@Builder
public class Book {
    @NonNull private final long id;
    private String title;
    private String author;
    private String genre;
    private float price;
    private float rating;
}