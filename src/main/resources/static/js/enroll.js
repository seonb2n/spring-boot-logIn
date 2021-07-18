(function ($) {
    $("#enroll-button").click(function () {
        var inputId = $('form input[name=id]').val();
        var inputNickName = $('form input[name=nickName]').val();
        var inputPassword = $('form input[name=password]').val();
        var userDto = {
                    id: inputId,
                    nickName: inputNickName,
                    password: inputPassword
                    };

        console.log(userDto)

        $.ajax({
            type: "POST",
            async: true,
            url: "/api/enroll",
            timeout: 30000,
            data: JSON.stringify(userDto),
            dataType:'json',
            contentType: "application/json",
            error: function (request, status, error) {
                alert(userDto)
            },
            success: function (result) {
                alert("Success")
            }
        });
    });

    $(document).ready(function () {
        console.log("init")
    });
})(jQuery);