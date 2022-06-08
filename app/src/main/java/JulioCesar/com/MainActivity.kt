package JulioCesar.com

import JulioCesar.com.ui.theme.ParcailA2.ConsultaParcial1Ap2Screen
import JulioCesar.com.ui.theme.ParcailA2.RegistroParcialScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import JulioCesar.com.ui.theme.PrimerParcialTheme
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerParcialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp(){
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = "ConsultaParcial"){
        composable("Consulta"){
            ConsultaParcial1Ap2Screen(navHostController = navHostController)
        }
        composable("RegistroParcial1Ap2"){
            RegistroParcialScreen(navHostController = navHostController)
        }
    }
}