package br.com.bsa.plataformaesgatividadefiap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.bsa.plataformaesgatividadefiap.ui.theme.PlataformaEsgAtividadeFiapTheme
import androidx.compose.foundation.background
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlataformaEsgAtividadeFiapTheme {
                MyScreenContent(title = "ESG", content = "Conteúdo")
            }
        }
    }
}

@Composable
fun MyScreenContent(title: String, content: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(16.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.esg1),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp)
        )

        Text(
            text = "A governança ambiental, social e corporativa é uma abordagem que avalia como uma corporação incorpora no seu processo de tomada de decisão aspectos Sociais, Ambientais e de Governança.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(20.dp)
        )
        Text(
            text = "Explicando o que é ESG.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "ESG é um conjunto de padrões e boas práticas que visa definir se uma empresa é socialmente consciente, sustentável e corretamente gerenciada. Trata-se de uma forma de medir o desempenho de sustentabilidade de uma organização.\n" +
                    "A sigla, em inglês, reúne os três pilares desse movimento:",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Ambiental (Environmental): Refere-se às práticas relacionadas ao meio ambiente, como redução de emissões de carbono, uso sustentável de recursos naturais e gestão de resíduos. \n" +
                    "Social: Avalia o impacto da empresa na sociedade, incluindo questões como diversidade, igualdade de gênero, saúde e segurança dos funcionários, entre outros.\n",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Governança: Diz respeito à estrutura de governança da empresa, transparência, ética nos negócios e responsabilidade dos gestores.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(20.dp)
        )
        Text(
            text = "Esses critérios são usados para determinar se uma empresa é uma opção viável de investimento sustentável, capaz de gerar impactos positivos financeiros, sociais e ambientais. A incorporação do ESG na estratégia de negócios reforça a ideia de que propósito e lucro estão interligados, e que as empresas devem considerar seu papel como agentes sociais. O ESG serve como um guia para avaliar a compreensão da influência da organização e o valor compartilhado que ela pode gerar em seu ecossistema de relacionamento.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Quais os princípios ESG?  Como ficou evidente, o índice é norteado por três princípios básicos. Que tal entender cada um em detalhes? Confira:",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.esg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp)
        )
        Text(
            text = "Ambiental\n" +
                    "Envolve a gestão de resíduos, uso de fontes de energia renováveis e políticas relacionadas ao desmatamento.\n" +
                    "Também considera a preservação da biodiversidade em terras da empresa.\n" +
                    "\n" +
                    "Social\n" +
                    "Investidores analisam o bem-estar dos funcionários.\n" +
                    "\n" +
                    "Pontos importantes incluem taxa de turnover, planos de previdência, envolvimento dos funcionários na gestão e benefícios oferecidos.\n",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(15.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMyScreenContent() {
    PlataformaEsgAtividadeFiapTheme {
        MyScreenContent(title = "Conceito ESG", content = "")
    }
}