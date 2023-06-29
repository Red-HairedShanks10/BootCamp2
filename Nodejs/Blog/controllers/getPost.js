"use strict"

const BlogPost = require('../models/BlogPost.js')

//render page of requested Blog post after getting its unique id
module.exports = async (req, res) => {
    const blogpost = await BlogPost.findById(req.params.id).populate('userid');
    console.log(blogpost)
    res.render('post', {
        blogpost
    });
}