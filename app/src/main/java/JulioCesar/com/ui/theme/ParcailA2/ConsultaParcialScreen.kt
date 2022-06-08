package JulioCesar.com.ui.theme.ParcailA2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun ConsultaParcial1Ap2Screen(
    navHostController: NavHostController,
    parcial1Ap2ViewModel: ParcialViewModel = hiltViewModel()
){

    val ScaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta del primer parcial") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate("RegistroParcial1Ap2")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        },
        scaffoldState = ScaffoldState

    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)) {
            //val listaclientes = clienteViewModel.clientes.collectAsState(initial = emptyList())

            /*  LazyColumn(modifier = Modifier.fillMaxWidth()){
                  items(listaclientes.value){
                          nombre -> RowPersona(nombre = nombre.nombre)
                  }
              }*/
        }
    }

}