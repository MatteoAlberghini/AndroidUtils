fun EditText.closeKeyboard(activity: Activity) {
    val view = activity.currentFocus
    view?.let {
        val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
