package com.restapi.webflux.functional

import com.restapi.webflux.document.Playlist
import com.restapi.webflux.service.PlaylistService
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.BodyInserters.fromPublisher
import reactor.core.publisher.Mono

@Component
class PlaylistHandler(
    private val playlistService: PlaylistService
) {

    fun findAll(request: ServerRequest): Mono<ServerResponse> {
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(playlistService.findAll(), Playlist::class.java)
    }

    fun findById(request: ServerRequest): Mono<ServerResponse> {
        val id = request.pathVariable("id")
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(playlistService.findById(id), Playlist::class.java)
    }

    fun save(request: ServerRequest): Mono<ServerResponse> {
        val playlist = request.bodyToMono(Playlist::class.java)
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(fromPublisher(playlist.flatMap(playlistService::save), Playlist::class.java))
    }

}