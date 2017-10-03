
  WinWait("[CLASS:#32770]","",10)

; Set input focus to the edit control of Upload window using the handle returned by WinWait

  ControlFocus("File Upload","","Edit")

  Sleep(2000)

; Set the File name text on the Edit field

  ControlSetText("File Upload", "", "Edit", "Y:\Drive M\Git Local Repository\Local Repo 1\Web-ASE\test\resources\TestData\10288-Shiv-Jettly.doc")

  Sleep(2000)

; Click on the Open button

  ControlClick("File Upload", "","Button")