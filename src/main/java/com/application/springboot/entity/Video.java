package com.application.springboot.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "video")
public class Video {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private int id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "category")
  private String category;

  @Column(name = "author_id")
  private String authorId;

  @CreationTimestamp
  @Column(name = "created_at", updatable = false, unique = true)
  private Date createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at", updatable = false, unique = true)
  private Date updatedAt;

  @Column(name = "video_file")
  private String videoFile;

  @Column(name = "duration")
  private String duration;

  public Video() {}

  public Video(String title, String description, String category, String authorId, Date createdAt, Date updatedAt, String videoFile, String duration) {
    this.title = title;
    this.description = description;
    this.category = category;
    this.authorId = authorId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.videoFile = videoFile;
    this.duration = duration;
  }

  @Override
  public String toString() {
    //return "Video{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", age='" + age + ", password='" + password + '\'' + ", location='" + location +
    // '\'' + ", bio='" + bio + '\'' + ", phone number='" + phoneNumber + '\'' + '}';
    return "";
  }
}
