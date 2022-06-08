package JulioCesar.com.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Parcial")
data class ParcialModel(
    @PrimaryKey(autoGenerate = true)
    val objetoId: Int,

):Parcelable