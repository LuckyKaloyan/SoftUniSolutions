function encodeAndDecodeMessages() {
    let buttons = Array.from(document.getElementsByTagName('button'));

    let buttonEncode = buttons[0];
    let buttonDecode = buttons[1];

    buttonEncode.addEventListener('click', function() {
        let messageTextarea = buttonEncode.parentElement.getElementsByTagName('textarea')[0];
        let encodedTextString = messageTextarea.value;
        let encodedMessage = '';

        for (let i = 0; i < encodedTextString.length; i++) {
            encodedMessage += String.fromCharCode(encodedTextString.charCodeAt(i) + 1);
        }
        
        let lastReceivedTextarea = buttonDecode.parentElement.getElementsByTagName('textarea')[0];
        lastReceivedTextarea.value = encodedMessage;

        messageTextarea.value = '';
    });

    buttonDecode.addEventListener('click', function() {
        let lastReceivedTextarea = buttonDecode.parentElement.getElementsByTagName('textarea')[0];
        let decodedTextString = lastReceivedTextarea.value;
        let decodedMessage = '';

        for (let i = 0; i < decodedTextString.length; i++) {
            decodedMessage += String.fromCharCode(decodedTextString.charCodeAt(i) - 1);
        }
          lastReceivedTextarea.value = decodedMessage;
    });
}
