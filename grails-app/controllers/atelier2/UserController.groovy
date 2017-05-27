package atelier2

class UserController {

    def index() { }
    def login() {
        if(params.username == "Ayoub") {
            flash.message = "Successful"
        }
        else flash.message = "Failed"

        redirect(url:'/')
    }
}
