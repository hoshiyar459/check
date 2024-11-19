package com.Abhishek.journal.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userentry")
@Data
@NoArgsConstructor
public class Journal {
    @Id
    private String id ;
    @NonNull
    private String name ;
    @NonNull
    private String title ;
}
