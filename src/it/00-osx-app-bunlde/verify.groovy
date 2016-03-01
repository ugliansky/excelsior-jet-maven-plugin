if (System.properties['os.name'].contains("OS X")) {
  File exeFile = new File(basedir, "target/jet/HelloSwing.app/Contents/MacOS/HelloSwing")
  assert exeFile.exists()
  File infoPlist = new File(basedir, "target/jet/HelloSwing.app/Contents/Info.plist")
  assert infoPlist.exists()
  assert infoPlist.text.contains("CFBundleIconFile")
}
