export interface Action {
    type: String,
    payload: any
}

export interface Player {
    id: String,
    name: String,
    email: String,
    score: Number,
    numWins: Number

}