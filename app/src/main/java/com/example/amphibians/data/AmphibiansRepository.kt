

package com.example.amphibians.data

import com.example.amphibians.model.Amphibian
import com.example.amphibians.network.AmphibiansApiService

    // Repositorio que recupera datos de anfibios

interface AmphibiansRepository {
    // Recupera una lista de anfibios
    suspend fun getAmphibians(): List<Amphibian>
}

    // Implementación de red del repositorio

class DefaultAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}
