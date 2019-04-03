fun BottomNavigationView.enableBottomBar(enable: Boolean) {
    for (i in 0 until this.menu.size()) {
        this.menu.getItem(i).isEnabled = enable
    }
}
