private fun onResumeFixed() {

}

private fun onStopFixed() {

}

override fun onHiddenChanged(hidden: Boolean) {
    super.onHiddenChanged(hidden)
    if (!hidden)
        this.onResumeFixed()
    else
        this.onStopFixed()
}
