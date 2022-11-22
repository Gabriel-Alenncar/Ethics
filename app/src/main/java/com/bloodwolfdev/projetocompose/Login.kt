package com.bloodwolfdev.projetocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodwolfdev.projetocompose.ui.theme.ProjetoComposeTheme
import kotlinx.coroutines.flow.MutableStateFlow
import java.util.jar.Attributes.Name

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background)
                {
                    Profile()

                }
            }
        }
    }
}


@Composable
fun Profile() {
    val name = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisibility = remember { mutableStateOf(false) }

    Scaffold(backgroundColor = MaterialTheme.colors.primary) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Card(
                Modifier
                    .weight(2f)
                    .padding(12.dp),
                shape = RoundedCornerShape(50.dp)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(25.dp)
                ) {
                    Text(
                        text = "Profile",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                    )

                    Image(
                    painter = painterResource(id = R.drawable.god),
                    contentDescription = null,
                    modifier = Modifier
                        .padding()
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.Center))


                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        OutlinedTextField(
                            value = name.value,
                            onValueChange = { name.value = it },
                            label = { Text(text = "Nome ") },
                            placeholder = { Text(text = "Digite o Nome ") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )
                        OutlinedTextField(
                            value = name.value,
                            onValueChange = { name.value = it },
                            label = { Text(text = "Zap ") },
                            placeholder = { Text(text = "Digite o Zap ") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )
                        OutlinedTextField(
                            value = name.value,
                            onValueChange = { name.value = it },
                            label = { Text(text = "Insta ") },
                            placeholder = { Text(text = "Digite o seu insta ") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )

                        OutlinedTextField(
                            value = passwordValue.value,
                            onValueChange = { passwordValue.value = it },
                            label = { Text("E-mail") },
                            placeholder = { Text(text = "Digite seu Email") },
                            singleLine = true,
                            visualTransformation = if (passwordVisibility.value) VisualTransformation.None
                            else PasswordVisualTransformation(),
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )

                        Spacer(modifier = Modifier.padding(10.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),Arrangement.SpaceBetween
                        ){



                        }

                        Button(onClick = {},
                            modifier = Modifier
                                .fillMaxWidth(0.4f)
                                .height(38.dp)) {
                            Text(text = "Next", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        }

                            }
                        }
                    }
                }
            }
        }




@Preview(showBackground = true)
@Composable
fun Default() {
    ProjetoComposeTheme {
        Profile()

    }
}