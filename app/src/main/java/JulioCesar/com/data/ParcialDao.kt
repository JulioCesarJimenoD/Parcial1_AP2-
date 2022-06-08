package JulioCesar.com.data

import JulioCesar.com.model.ParcialModel
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ParcialDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(cliente : ParcialModel)

    @Delete fun Eliminar(cliente: ParcialModel)

    @Query("""
        SELECT * 
        FROM Parcial
        WHERE objetoId=:objetoId        
    """)
    fun Buscar(objetoId: Int): Flow<ParcialModel>

    @Query("""
        SELECT * 
        FROM Parcial
        ORDER BY objetoId    
    """)
    fun GetLista(): Flow<List<ParcialModel>>
}