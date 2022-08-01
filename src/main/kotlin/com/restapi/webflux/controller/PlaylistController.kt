package com.restapi.webflux.controller

import com.restapi.webflux.document.Playlist
import com.restapi.webflux.service.PlaylistService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.util.function.Tuple2
import java.time.Duration
import java.time.LocalDateTime

@RestController
@RequestMapping("playlists")
class PlaylistController(
    private val playlistService: PlaylistService
) {

    @GetMapping
    fun getPlaylists() : Flux<Playlist> {
        return playlistService.findAll()
    }

    @GetMapping("{id}")
    fun getPlaylistId(@PathVariable id: String) : Mono<Playlist> {
        return playlistService.findById(id)
    }

    @PostMapping
    fun savePlaylist(@RequestBody playlist: Playlist): Mono<Playlist> {
        return playlistService.save(playlist)
    }

    @GetMapping(value = ["/webflux"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getPlaylistByWebflux(): Flux<Tuple2<Long?, Playlist?>?>? {
        println("---Start get Playlists by WEBFLUX--- " + LocalDateTime.now())
        val interval = Flux.interval(Duration.ofSeconds(10))
        val playlistFlux: Flux<Playlist> = playlistService.findAll()
        return Flux.zip(interval, playlistFlux)
    }

}