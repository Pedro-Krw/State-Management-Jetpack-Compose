package com.pedro.statemanagement

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pedro.statemanagement.ui.theme.StateManagementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateManagementTheme {
                // A surface container using the 'background' color from the theme
             Column {

                 StateMenajement()
             }

            }
        }
    }
}

@Composable
fun StateMenajement() {

    Row(modifier = Modifier.padding(10.dp) , horizontalArrangement = Arrangement.Center){
        val init : Boolean = false
        val checkboxState =  remember { mutableStateOf(init) }
        Checkbox(checked = checkboxState.value , onCheckedChange = {checkboxState.value = it})
        Spacer(modifier = Modifier.padding(4.dp))
        Text("Check Box" , color = Color.White)

    }

    Row(modifier = Modifier.padding(10.dp) , horizontalArrangement = Arrangement.Center){
        val init : Boolean = false
        val checkboxState =  remember { mutableStateOf(init) }
        Checkbox(checked = checkboxState.value , onCheckedChange = {checkboxState.value = it})
        Spacer(modifier = Modifier.padding(4.dp))
        Text("Check Box 2" , color = Color.White)

    }
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun DefaultPreview() {
    StateManagementTheme {
        StateMenajement()
    }
}