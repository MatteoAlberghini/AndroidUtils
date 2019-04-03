
// 0 is the size we want to resize - Needs to be at least one non zero size
myImageView.post {
    Picasso.get()
        .load(fullFlayerString)
        .noPlaceholder()
        .resize(myImageView.width, 0)
        .into(myImageView)
}
