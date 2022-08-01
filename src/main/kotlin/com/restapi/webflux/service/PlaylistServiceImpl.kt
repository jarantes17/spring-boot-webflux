package com.restapi.webflux.service

import com.restapi.webflux.document.Playlist
import com.restapi.webflux.repository.PlaylistRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PlaylistServiceImpl(
    private val playlistRepository: PlaylistRepository
) : PlaylistService {

    override fun findAll(): Flux<Playlist> {
        return playlistRepository.findAll()
    }

    override fun findById(id: String): Mono<Playlist> {
        return playlistRepository.findById(id)
    }

    override fun save(playlist: Playlist): Mono<Playlist> {
        return playlistRepository.save(playlist)
    }

}