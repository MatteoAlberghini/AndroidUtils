val builder = AlertDialog.Builder(context)
builder.setTitle("Title")
builder.setMessage("Body Message")
builder.setPositiveButton("Positive button"){_, _ ->
    someFunction()
}
builder.setNegativeButton("Cancel button"){_, _ ->

}
val dialog = builder.create()
dialog.show()
