// Show toast with lenght short as default
fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {

    Toast.makeText(this, message, duration).show()

}

fun Context.showToastNull(message: String?, duration: Int = Toast.LENGTH_SHORT) {

    Toast.makeText(this, message.toString(), duration).show()

}

fun Context.showToastWithClosure(message: String, duration: Int = Toast.LENGTH_LONG, function: () -> Unit) {

    Toast.makeText(this, message, duration).show()
    function()

}
