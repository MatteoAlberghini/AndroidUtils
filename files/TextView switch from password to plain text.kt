private var isShow = false

private fun textViewClicked() {
    if(isShow) {
        textView.transformationMethod = HideReturnsTransformationMethod.getInstance()
        isShow = false
        return
    }
    textView.transformationMethod = PasswordTransformationMethod.getInstance()
    isShow = true
}
