package JulioCesar.com.ui.theme.ParcailA2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroParcialScreen(
    navHostController: NavHostController,
    parcialViewModel: ParcialViewModel = hiltViewModel()
) {

    //val ocup = listOf("Maestro", "Ingeniero", "Doctor", "Carpinterio")

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Registro del primer parcial") }) }
    ){


        Column(modifier = Modifier.padding(8.dp)) {








            OutlinedButton(
                onClick = {
                    parcialViewModel.Guardar()
                    navHostController.navigateUp()
                }
            ) {
                Text(text = "Guardar")
            }
        }
    }
}