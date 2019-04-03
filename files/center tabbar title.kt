fun Activity.centerTitle() {
    val textViews = ArrayList<View>()
    this.window.decorView.findViewsWithText(textViews, title, View.FIND_VIEWS_WITH_TEXT)
    if (textViews.size > 0) {
        var appCompatTextView: AppCompatTextView? = null
        if (textViews.size == 1)
            appCompatTextView = textViews[0] as AppCompatTextView
        else {
            for (v in textViews) {
                if (v.parent is Toolbar) {
                    appCompatTextView = v as AppCompatTextView
                    break
                }
            }
        }
        if (appCompatTextView != null) {
            val params = appCompatTextView.layoutParams
            params.width = ViewGroup.LayoutParams.MATCH_PARENT
            appCompatTextView.layoutParams = params
            appCompatTextView.textAlignment = View.TEXT_ALIGNMENT_CENTER
        }
    }
}
