package com.example.study_java8.store.jpa.jpo;

import com.example.study_java8.domain.Board;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Data
public class BoardJpo {

    @Id
    private String title;
    private String content;

    public Board toDomain() {
        return new Board(
                this.title,
                this.content
        );
    }

}
