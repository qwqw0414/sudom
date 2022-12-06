import * as React from "react";
import { Link } from "react-router-dom";

export default function Main() {
    return (
        <>
            <div>
                <Link to="/auth/signin">signin</Link>
            </div>
            <div>
                <Link to="/auth/signup">signup</Link>
            </div>
            <div>
                <Link to="/">main</Link>
            </div>
        </>
    )
}