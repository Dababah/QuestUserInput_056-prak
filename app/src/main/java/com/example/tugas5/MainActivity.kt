
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable(onClick = onSelected)
    ) {
        RadioButton(
            selected = selected,
            onClick = null,
            colors = RadioButtonDefaults.colors(selectedColor = Color(0xFF7E57C2))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text, color = Color.Black)
    }
}