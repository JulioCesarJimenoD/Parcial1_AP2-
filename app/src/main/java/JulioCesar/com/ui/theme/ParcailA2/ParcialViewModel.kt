package JulioCesar.com.ui.theme.ParcailA2

import JulioCesar.com.data.Repository.ParcialRepository
import JulioCesar.com.model.ParcialModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ParcialViewModel @Inject constructor(
    val parcialRepository: ParcialRepository
): ViewModel() {

// var clientes = clienteRepository.GetLista()

    var clienteID by mutableStateOf(0)
/*    var nombre by mutableStateOf("")
    var email by mutableStateOf("")
    var ocupacionId by mutableStateOf(0)
    var balance by mutableStateOf("")*/

    fun Guardar(){
        viewModelScope.launch {
            parcialRepository.Insertar(
                ParcialModel(
                    objetoId = clienteID,
                    /*nombre = nombre,
                    email = email,
                    ocupacionId = ocupacionId,
                    balance = balance.toString().toDouble()*/
                )
            )
        }
    }

}