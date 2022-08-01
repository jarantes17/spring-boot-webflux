package com.restapi.webflux.repository

import com.restapi.webflux.document.Playlist
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PlaylistRepository : ReactiveMongoRepository<Playlist, String> {
}