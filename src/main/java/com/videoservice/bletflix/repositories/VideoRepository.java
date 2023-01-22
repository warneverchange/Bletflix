package com.videoservice.bletflix.repositories;

import com.videoservice.bletflix.domains.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}