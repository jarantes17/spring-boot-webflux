package com.restapi.webflux

import com.restapi.webflux.document.Playlist
import com.restapi.webflux.repository.PlaylistRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.util.UUID

@Component
class DummyData(
    private val playlistRepository: PlaylistRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        playlistRepository.deleteAll()
            .thenMany(
                Flux.just(
                    "API REST Spring Boot",
                    "Deploy de uma aplicação java com IBM Cloud",
                    "Java 8",
                    "GitHub",
                    "Spring Security",
                    "WebService RESTFULL",
                    "Bean no spring framework"
                ).map { name -> Playlist(UUID.randomUUID().toString(), name) }
                    .flatMap(playlistRepository::save))
            .subscribe(System.out::println)

    }

}