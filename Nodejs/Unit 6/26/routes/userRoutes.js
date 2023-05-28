const router = require("express").Router();;
const usersController = require("../controllers/usersController");

// Must make sure to remove /users
router.get("/", usersController.index, usersController.indexView);
router.get("/new", usersController.new);
router.post("/create", usersController.validate, usersController.create, usersController.redirectView);
router.get("/login", usersController.login);//login route
router.post("/login", usersController.authenticate);//authentication route
router.get("/logout", usersController.logout, usersController.redirectView);
router.get("/:id/edit", usersController.edit);
router.put("/:id/update", usersController.update, usersController.redirectView);
router.get("/:id", usersController.show, usersController.showView);
router.delete("/:id/delete", usersController.delete, usersController.redirectView);

module.exports = router;