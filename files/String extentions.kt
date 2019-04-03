// String to xml - THROWS -
@Throws(Exception::class)
fun String.toXMLDocument(): Document {
    val factory = DocumentBuilderFactory.newInstance()
    val builder = factory.newDocumentBuilder()
    val `is` = InputSource(StringReader(this))
    return builder.parse(`is`)
}
