package com.trian0.trippy.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trian0.trippy.R
import com.trian0.trippy.ui.components.Background
import com.trian0.trippy.ui.theme.Blue40

@Composable
fun LoginScreen() {
    Scaffold { paddingValues ->
        Background {
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Trippy Logo",
                    modifier = Modifier.size(200.dp)
                )

                Text(
                    text = "Bem-vindo de volta!",
                    style = MaterialTheme.typography.headlineLarge
                )

                Spacer(Modifier.height(18.dp))

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    text = "Faça login na sua conta para continuar sua jornada.",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(46.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    value = "",
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Blue40,
                        unfocusedBorderColor = Blue40,
                        cursorColor = Blue40,
                    ),
                    onValueChange = {},
                    leadingIcon = {
                        Image(
                            painter = painterResource(R.drawable.ic_email_24_dp),
                            contentDescription = "Password Icon"
                        )
                    },
                    label = { Text("Email") },
                    singleLine = true
                )

                Spacer(Modifier.height(16.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    value = "",
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Blue40,
                        unfocusedBorderColor = Blue40,
                        cursorColor = Blue40,
                    ),
                    onValueChange = {},
                    leadingIcon = {
                        Image(
                            painter = painterResource(R.drawable.ic_locked_24_dp),
                            contentDescription = "Password Icon"
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(R.drawable.ic_password_visible_24_dp),
                            contentDescription = "Password Icon"
                        )
                    },
                    label = { Text("Senha") },
                    singleLine = true
                )

                Spacer(Modifier.height(48.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    colors = ButtonColors(
                        containerColor = Blue40,
                        contentColor = Color.White,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.Black
                    ),
                    onClick = {}
                ) {
                    Text(text = "Entrar", style = MaterialTheme.typography.labelLarge)
                }
            }
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}