package JulioCesar.com.data

import JulioCesar.com.model.ParcialModel
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ParcialModel::class],
    version = 1
)
abstract class ParcialDb : RoomDatabase(){
    abstract val ParcialDao : ParcialDao
}