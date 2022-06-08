package JulioCesar.com.di

import JulioCesar.com.data.ParcialDao
import JulioCesar.com.data.ParcialDb
import JulioCesar.com.data.Repository.ParcialRepository
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides

    fun ProvideTickedDb(@ApplicationContext context: Context): ParcialDb{

        val DATABASE_NAME = "ParcialDb2"
        return Room.databaseBuilder(
            context,
            ParcialDb::class.java,
            DATABASE_NAME )
            .fallbackToDestructiveMigration()
            .build()

    }
    @Provides
    fun ProvideClienteDAO(ParcialDb2: ParcialDb): ParcialDao
    {
        return ParcialDb2.ParcialDao
    }

    @Provides
    fun ProvideClienteRepository(parcialDao: ParcialDao): ParcialRepository{
        return ParcialRepository(parcialDao)
    }
}