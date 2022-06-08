package JulioCesar.com.data.Repository

import JulioCesar.com.data.ParcialDao
import JulioCesar.com.data.ParcialDb
import JulioCesar.com.model.ParcialModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ParcialRepository @Inject constructor(
    val parcialDao: ParcialDao){

    suspend fun Insertar(Parcial: ParcialModel) = parcialDao.Insertar(Parcial)

    //fun Buscar(paracialModel: Int): Flow<ParcialModel> = ParcialDao.Buscar(paracialModel)

    suspend fun Eliminar(paracialModel: ParcialModel) = parcialDao.Eliminar(paracialModel)
    fun GetLista(): Flow<List<ParcialModel>> = parcialDao.GetLista()
}