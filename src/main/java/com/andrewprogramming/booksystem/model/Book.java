package com.andrewprogramming.booksystem.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@ApiModel("图书实体类")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
@Data
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private String id;

  @ApiModelProperty(value = "图书名字")
  @NotNull
  @Column(name = "book_name")
  private String name;
  private String author;


}
