package skynetbee.developer.nithish

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import skynetbee.developer.nithish.ui.theme.NithishTheme
import skynetbee.developers.nithish._Class
import skynetbee.developers.nithish._Method

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NithishTheme {
                chumma()
            }
        }
    }

    @Composable
    fun chumma(){

        Column (
                Modifier
                        .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
        ){

            Text(
                    "${_Class} @ ${_Method}",
                    fontSize = 22.sp
            )
        }
    }
}

